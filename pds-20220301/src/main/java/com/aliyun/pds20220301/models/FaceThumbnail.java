// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class FaceThumbnail extends TeaModel {
    @NameInMap("face_group_id")
    public String faceGroupId;

    @NameInMap("face_id")
    public String faceId;

    @NameInMap("face_thumbnail")
    @Deprecated
    public String faceThumbnail;

    public static FaceThumbnail build(java.util.Map<String, ?> map) throws Exception {
        FaceThumbnail self = new FaceThumbnail();
        return TeaModel.build(map, self);
    }

    public FaceThumbnail setFaceGroupId(String faceGroupId) {
        this.faceGroupId = faceGroupId;
        return this;
    }
    public String getFaceGroupId() {
        return this.faceGroupId;
    }

    public FaceThumbnail setFaceId(String faceId) {
        this.faceId = faceId;
        return this;
    }
    public String getFaceId() {
        return this.faceId;
    }

    public FaceThumbnail setFaceThumbnail(String faceThumbnail) {
        this.faceThumbnail = faceThumbnail;
        return this;
    }
    public String getFaceThumbnail() {
        return this.faceThumbnail;
    }

}
