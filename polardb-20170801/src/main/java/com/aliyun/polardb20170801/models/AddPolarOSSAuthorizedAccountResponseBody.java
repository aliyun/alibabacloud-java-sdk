// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class AddPolarOSSAuthorizedAccountResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>arn:sts::123456:assumed-role/myrole/*</p>
     */
    @NameInMap("AuthorizedUserArnIds")
    public String authorizedUserArnIds;

    /**
     * <strong>example:</strong>
     * <p>1234567890,9876543210</p>
     */
    @NameInMap("AuthorizedUserIds")
    public String authorizedUserIds;

    /**
     * <strong>example:</strong>
     * <p>pfs-xxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("PfsInstanceId")
    public String pfsInstanceId;

    /**
     * <strong>example:</strong>
     * <p>F45FFACC-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddPolarOSSAuthorizedAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddPolarOSSAuthorizedAccountResponseBody self = new AddPolarOSSAuthorizedAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public AddPolarOSSAuthorizedAccountResponseBody setAuthorizedUserArnIds(String authorizedUserArnIds) {
        this.authorizedUserArnIds = authorizedUserArnIds;
        return this;
    }
    public String getAuthorizedUserArnIds() {
        return this.authorizedUserArnIds;
    }

    public AddPolarOSSAuthorizedAccountResponseBody setAuthorizedUserIds(String authorizedUserIds) {
        this.authorizedUserIds = authorizedUserIds;
        return this;
    }
    public String getAuthorizedUserIds() {
        return this.authorizedUserIds;
    }

    public AddPolarOSSAuthorizedAccountResponseBody setPfsInstanceId(String pfsInstanceId) {
        this.pfsInstanceId = pfsInstanceId;
        return this;
    }
    public String getPfsInstanceId() {
        return this.pfsInstanceId;
    }

    public AddPolarOSSAuthorizedAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
