// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ResetApplicationAccountPasswordRequest extends TeaModel {
    /**
     * <p>The account name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mcp_user</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The application ID. Only applications associated with PolarDB for MySQL clusters are supported. Before calling this operation, you can call DescribeApplicationAttribute to obtain the DBClusterId associated with the application, and then call DescribeDBClusterAttribute to query the DBType of the cluster and confirm that the value is MySQL. This operation is not applicable to associated applications of other database engine types.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-bp1abcdef1234567</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The new password.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Pw123456</p>
     */
    @NameInMap("NewAccountPassword")
    public String newAccountPassword;

    public static ResetApplicationAccountPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetApplicationAccountPasswordRequest self = new ResetApplicationAccountPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ResetApplicationAccountPasswordRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ResetApplicationAccountPasswordRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ResetApplicationAccountPasswordRequest setNewAccountPassword(String newAccountPassword) {
        this.newAccountPassword = newAccountPassword;
        return this;
    }
    public String getNewAccountPassword() {
        return this.newAccountPassword;
    }

}
