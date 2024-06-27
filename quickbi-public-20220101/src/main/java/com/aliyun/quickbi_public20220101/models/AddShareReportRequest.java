// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddShareReportRequest extends TeaModel {
    /**
     * <p>The scope of authorization. Valid values:</p>
     * <ul>
     * <li>1: view only</li>
     * <li>3: View and export</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("AuthPoint")
    public Integer authPoint;

    /**
     * <p>The validity period of the share. The value is a timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1608202110838</p>
     */
    @NameInMap("ExpireDate")
    public Long expireDate;

    /**
     * <p>The ID of the person to be shared, which may be the user ID of the Quick BI or the user group ID.</p>
     * <ul>
     * <li>If ShareToType is 0 (user), ShareTo is the user ID.</li>
     * <li>When ShareToType is set to 1 (user group), ShareTo is the user group ID.</li>
     * <li>When ShareToType=2 (organization), ShareTo is the ID of the organization.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>de4bc5f9429141cc8091cdd1c15b****</p>
     */
    @NameInMap("ShareToId")
    public String shareToId;

    /**
     * <p>The share type of the template. Valid values:</p>
     * <ul>
     * <li>0: user</li>
     * <li>1: user group</li>
     * <li>2: organization</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ShareToType")
    public Integer shareToType;

    /**
     * <p>The ID of the shared work. The works here include BI portal, dashboards, spreadsheets, and self-service access.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6b407e50-e774-406b-9956-da2425c2****</p>
     */
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
