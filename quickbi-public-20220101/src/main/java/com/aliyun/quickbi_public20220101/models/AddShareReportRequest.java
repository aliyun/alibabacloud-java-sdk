// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddShareReportRequest extends TeaModel {
    /**
     * <p>The authorization type. Valid values:</p>
     * <ul>
     * <li>1: View only.</li>
     * <li>3: View and export.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("AuthPoint")
    public Integer authPoint;

    /**
     * <p>The expiration time of the sharing, in millisecond-level UNIX timestamp format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1608202110838</p>
     */
    @NameInMap("ExpireDate")
    public Long expireDate;

    /**
     * <p>The ID of the share recipient. The value can be a Quick BI user ID or a user group ID.</p>
     * <ul>
     * <li>ShareToType=0 (user): ShareTo is the user ID.</li>
     * <li>ShareToType=1 (user group): ShareTo is the user group ID.</li>
     * <li>ShareToType=2 (organization): ShareTo is the organization ID.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>de4bc5f9429141cc8091cdd1c15b****</p>
     */
    @NameInMap("ShareToId")
    public String shareToId;

    /**
     * <p>The sharing type. Valid values:</p>
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
     * <p>The ID of the work to share. Works include data portals, dashboards, workbooks, and ad hoc queries.</p>
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
