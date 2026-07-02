// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class IpWhiteListConfigRequest extends TeaModel {
    /**
     * <p>Required for increase and delete operations. The IP whitelist. Separate multiple IP addresses with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>60.205.254.120</p>
     */
    @NameInMap("IpWhiteList")
    public String ipWhiteList;

    /**
     * <p>The operation type. Valid values:</p>
     * <ul>
     * <li>ADD: incrementally adds entries.</li>
     * <li>DELETE: deletes entries.</li>
     * <li>QUERY: queries entries.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>add</p>
     */
    @NameInMap("Operation")
    public String operation;

    public static IpWhiteListConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        IpWhiteListConfigRequest self = new IpWhiteListConfigRequest();
        return TeaModel.build(map, self);
    }

    public IpWhiteListConfigRequest setIpWhiteList(String ipWhiteList) {
        this.ipWhiteList = ipWhiteList;
        return this;
    }
    public String getIpWhiteList() {
        return this.ipWhiteList;
    }

    public IpWhiteListConfigRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

}
