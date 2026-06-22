// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyOpenLogShipperRequest extends TeaModel {
    /**
     * <p>The identifier of the request source. Default value: <strong>aegis</strong>. Valid values:</p>
     * <ul>
     * <li><strong>aegis</strong>: Server Guard edition.</li>
     * <li><strong>sas</strong>: Security Center edition.</li>
     * </ul>
     * <blockquote>
     * <p>Server Guard users must use <strong>aegis</strong>, and Security Center users must use <strong>sas</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The ID of the member accounts in the resource directory (Alibaba Cloud account).</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>127608589417****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    public static ModifyOpenLogShipperRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyOpenLogShipperRequest self = new ModifyOpenLogShipperRequest();
        return TeaModel.build(map, self);
    }

    public ModifyOpenLogShipperRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public ModifyOpenLogShipperRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

}
