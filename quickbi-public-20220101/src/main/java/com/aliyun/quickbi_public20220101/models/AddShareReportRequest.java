// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddShareReportRequest extends TeaModel {
    @NameInMap("AuthPoint")
    public Integer authPoint;

    @NameInMap("ExpireDate")
    public Long expireDate;

    @NameInMap("ShareToId")
    public String shareToId;

    @NameInMap("ShareToType")
    public Integer shareToType;

    @NameInMap("WorksId")
    public String worksId;

    public static AddShareReportRequest build(java.util.Map<String, ?> map) throws Exception {
        AddShareReportRequest self = new AddShareReportRequest();
        return TeaModel.build(map, self);
    }

    public AddShareReportRequest setAuthPoint(Integer authPoint) {
        this.authPoint = authPoint;
        return this;
    }
    public Integer getAuthPoint() {
        return this.authPoint;
    }

    public AddShareReportRequest setExpireDate(Long expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public Long getExpireDate() {
        return this.expireDate;
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

    public AddShareReportRequest setWorksId(String worksId) {
        this.worksId = worksId;
        return this;
    }
    public String getWorksId() {
        return this.worksId;
    }

}
