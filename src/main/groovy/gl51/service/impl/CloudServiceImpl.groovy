package gl51.service.impl

import gl51.service.CloudService
import gl51.data.Picture
import gl51.service.PictureFetchService
import gl51.service.PictureResizeService
import gl51.service.ThumbnailService
import gl51.service.WaterMarkService

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CloudServiceImpl implements CloudService {
    @Inject ThumbnailService thumbnailService
    @Inject PictureResizeService pictureResizeService
    @Override
    boolean uploadToCloud() {
        Picture pic, thumbnail;
        pic = pictureResizeService.resizePicture(1024, 1024);
        thumbnail = thumbnailService.generateThumbnail();
        return true;
    }
}
