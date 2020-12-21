// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetFaceModelResultRequest extends TeaModel {
    @NameInMap("PictureId")
    public String pictureId;

    @NameInMap("PictureContent")
    public String pictureContent;

    @NameInMap("PictureUrl")
    public String pictureUrl;

    public static GetFaceModelResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFaceModelResultRequest self = new GetFaceModelResultRequest();
        return TeaModel.build(map, self);
    }

    public GetFaceModelResultRequest setPictureId(String pictureId) {
        this.pictureId = pictureId;
        return this;
    }
    public String getPictureId() {
        return this.pictureId;
    }

    public GetFaceModelResultRequest setPictureContent(String pictureContent) {
        this.pictureContent = pictureContent;
        return this;
    }
    public String getPictureContent() {
        return this.pictureContent;
    }

    public GetFaceModelResultRequest setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
        return this;
    }
    public String getPictureUrl() {
        return this.pictureUrl;
    }

}
