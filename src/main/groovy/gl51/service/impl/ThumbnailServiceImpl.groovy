package gl51.service.Impl

import gl51.data.Picture
import gl51.service.PictureFetchService
import gl51.service.ThumbnailService
import gl51.service.WaterMarkService

import javax.inject.Inject

class ThumbnailServiceImpl implements ThumbnailService{
    @Inject WaterMarkService waterMarkService;
    @Inject PictureFetchService pictureFetchService;
    @Override
    Picture generateThumbnail() {
        Picture pic = pictureFetchService.fetchPicture();
        pic.setHeight(50);
        pic.setWidth(50);
        waterMarkService.addWaterMark(pic);
        return pic;
    }
}
