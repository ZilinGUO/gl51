package gl51.service

import gl51.data.Picture

interface PictureResizeService {
    void resizePicture(int width, int height);
}