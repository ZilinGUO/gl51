
package gl51.service.Impl

import gl51.data.Picture
import gl51.service.PictureFetchService
import gl51.service.PictureResizeService
import javax.inject.Inject

import javax.inject.Singleton

@Singleton
class PictureResizeServiceImpl implements PictureResizeService{
    @Inject PictureFetchService pictureFetchService

    @Override
    void resizePicture(int width, int height) {
        Picture pic = pictureFetchService.fetchPicture();
        pic.setWidth(width);
        pic.setHeight(height);
    }
}
