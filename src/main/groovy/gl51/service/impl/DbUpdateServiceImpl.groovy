package gl51.service.impl

import gl51.data.Picture
import gl51.service.DbUpdateService
import gl51.service.PictureFetchService

import javax.inject.Inject

public class DbUpdateServiceImpl implements DbUpdateService {

    @Inject PictureFetchService pictureFetchService;
    @Override
    boolean updateDb() {
        Picture pic = pictureFetchService.fetchPicture();
        String name = pic.name;
        String path = pic.path
        // update database
        return true;
    }
}
