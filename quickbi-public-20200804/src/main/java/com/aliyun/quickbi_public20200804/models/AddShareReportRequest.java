// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200804.models;

import com.aliyun.tea.*;

public class AddShareReportRequest extends TeaModel {
    @NameInMap("WorksId")
    public String worksId;

    @NameInMap("ShareToId")
    public String shareToId;

    @NameInMap("ShareToType")
    public Integer shareToType;

    @NameInMap("ExpireDate")
    public Long expireDate;

    @NameInMap("AuthPoint")
    public Integer authPoint;

    public static AddShareReportRequest build(java.util.Map<String, ?> map) throws Exception {
        AddShareReportRequest self = new AddShareReportRequest();
        return TeaModel.build(map, self);
    }

    public AddShareReportRequest setWorksId(String worksId) {
        this.worksId = worksId;
        return this;
    }
    public String getWorksId() {
        return this.worksId;
    }

    public AddShareReportRequest setShareToId(String shareToId) {
        this.shareToId = shareToId;
        return this;
    }
    public String getShareToId() {
        return this.shareToId;
    }

    public AddShareReportRequest setShareToType(Integer shareToType) {
        this.shareToType = shareToType;
        return this;
    }
    public Integer getShareToType() {
        return this.shareToType;
    }

    public AddShareReportRequest setExpireDate(Long expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public Long getExpireDate() {
        return this.expireDate;
    }

    public AddShareReportRequest setAuthPoint(Integer authPoint) {
        this.authPoint = authPoint;
        return this;
    }
    public Integer getAuthPoint() {
        return this.authPoint;
    }

}
