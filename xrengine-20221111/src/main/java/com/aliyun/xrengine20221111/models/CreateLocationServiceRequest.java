// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class CreateLocationServiceRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ImageId")
    public Long imageId;

    @NameInMap("JwtToken")
    public String jwtToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Note")
    public String note;

    @NameInMap("Qps")
    public Long qps;

    public static CreateLocationServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLocationServiceRequest self = new CreateLocationServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateLocationServiceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateLocationServiceRequest setImageId(Long imageId) {
        this.imageId = imageId;
        return this;
    }
    public Long getImageId() {
        return this.imageId;
    }

    public CreateLocationServiceRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public CreateLocationServiceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLocationServiceRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public CreateLocationServiceRequest setQps(Long qps) {
        this.qps = qps;
        return this;
    }
    public Long getQps() {
        return this.qps;
    }

}
