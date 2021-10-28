// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeExpressSyncSharesRequest extends TeaModel {
    @NameInMap("ExpressSyncIds")
    public String expressSyncIds;

    @NameInMap("IsExternal")
    public Boolean isExternal;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeExpressSyncSharesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressSyncSharesRequest self = new DescribeExpressSyncSharesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExpressSyncSharesRequest setExpressSyncIds(String expressSyncIds) {
        this.expressSyncIds = expressSyncIds;
        return this;
    }
    public String getExpressSyncIds() {
        return this.expressSyncIds;
    }

    public DescribeExpressSyncSharesRequest setIsExternal(Boolean isExternal) {
        this.isExternal = isExternal;
        return this;
    }
    public Boolean getIsExternal() {
        return this.isExternal;
    }

    public DescribeExpressSyncSharesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
