// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateAgentClientInstallRequest extends TeaModel {
    /**
     * <p>The IDs of the servers on which you want to install the Security Center agent. Separate multiple IDs with commas (,).</p>
     * <br>
     * <p>> : You must specify at least one of **InstanceIds** and **Uuids**. If you specify **InstanceIds**, you must also specify **Region** and **Os**.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The operating system of the servers. Valid values:</p>
     * <br>
     * <p>*   **linux**</p>
     * <p>*   **windows**</p>
     */
    @NameInMap("Os")
    public String os;

    /**
     * <p>The region where the servers reside. Valid values include the following regions:</p>
     * <br>
     * <p>*   cn-hangzhou: China (Hangzhou)</p>
     * <p>*   cn-beijing: China (Beijing)</p>
     * <p>*   cn-shanghai: China (Shanghai)</p>
     * <p>*   cn-zhangjiakou: China (Zhangjiakou)</p>
     * <p>*   cn-shenzhen: China (Shenzhen)</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The UUIDs of the servers on which you want to install the Security Center agent. Separate multiple UUIDs with commas (,).</p>
     * <br>
     * <p>> You must specify at least one of the **InstanceIds** and **Uuids** parameters before you can call this operation.</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    public static OperateAgentClientInstallRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateAgentClientInstallRequest self = new OperateAgentClientInstallRequest();
        return TeaModel.build(map, self);
    }

    public OperateAgentClientInstallRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public OperateAgentClientInstallRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public OperateAgentClientInstallRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public OperateAgentClientInstallRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public OperateAgentClientInstallRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
