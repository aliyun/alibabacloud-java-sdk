// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateMainVersionParam extends TeaModel {
    // status
    @NameInMap("imageId")
    public String imageId;

    // mainVersion
    @NameInMap("mainVersion")
    public String mainVersion;

    @NameInMap("mainVersionMeta")
    public MainVersionMeta mainVersionMeta;

    // imageId
    @NameInMap("releaseType")
    public String releaseType;

    // type
    @NameInMap("uuid")
    public String uuid;

    public static CreateMainVersionParam build(java.util.Map<String, ?> map) throws Exception {
        CreateMainVersionParam self = new CreateMainVersionParam();
        return TeaModel.build(map, self);
    }

    public CreateMainVersionParam setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateMainVersionParam setMainVersion(String mainVersion) {
        this.mainVersion = mainVersion;
        return this;
    }
    public String getMainVersion() {
        return this.mainVersion;
    }

    public CreateMainVersionParam setMainVersionMeta(MainVersionMeta mainVersionMeta) {
        this.mainVersionMeta = mainVersionMeta;
        return this;
    }
    public MainVersionMeta getMainVersionMeta() {
        return this.mainVersionMeta;
    }

    public CreateMainVersionParam setReleaseType(String releaseType) {
        this.releaseType = releaseType;
        return this;
    }
    public String getReleaseType() {
        return this.releaseType;
    }

    public CreateMainVersionParam setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
