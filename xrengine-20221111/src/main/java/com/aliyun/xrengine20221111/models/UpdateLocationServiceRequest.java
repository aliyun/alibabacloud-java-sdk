// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class UpdateLocationServiceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public Long id;

    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("Note")
    public String note;

    @NameInMap("Qps")
    public Integer qps;

    @NameInMap("SvcName")
    public String svcName;

    @NameInMap("SvcState")
    public String svcState;

    public static UpdateLocationServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLocationServiceRequest self = new UpdateLocationServiceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLocationServiceRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateLocationServiceRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public UpdateLocationServiceRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public UpdateLocationServiceRequest setQps(Integer qps) {
        this.qps = qps;
        return this;
    }
    public Integer getQps() {
        return this.qps;
    }

    public UpdateLocationServiceRequest setSvcName(String svcName) {
        this.svcName = svcName;
        return this;
    }
    public String getSvcName() {
        return this.svcName;
    }

    public UpdateLocationServiceRequest setSvcState(String svcState) {
        this.svcState = svcState;
        return this;
    }
    public String getSvcState() {
        return this.svcState;
    }

}
