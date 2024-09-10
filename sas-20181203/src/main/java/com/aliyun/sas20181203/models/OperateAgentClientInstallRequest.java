// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateAgentClientInstallRequest extends TeaModel {
    /**
     * <p>The IDs of the servers on which you want to install the Security Center agent. Separate multiple IDs with commas (,).</p>
     * <blockquote>
     * <p>: You must specify at least one of <strong>InstanceIds</strong> and <strong>Uuids</strong>. If you specify <strong>InstanceIds</strong>, you must also specify <strong>Region</strong> and <strong>Os</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>i-uf6j8vq9l4r5ntht****</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The operating system of the servers. Valid values:</p>
     * <ul>
     * <li><strong>linux</strong></li>
     * <li><strong>windows</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>linux</p>
     */
    @NameInMap("Os")
    public String os;

    /**
     * <p>The region where the servers reside. Valid values include the following regions:</p>
     * <ul>
     * <li>cn-hangzhou: China (Hangzhou)</li>
     * <li>cn-beijing: China (Beijing)</li>
     * <li>cn-shanghai: China (Shanghai)</li>
     * <li>cn-zhangjiakou: China (Zhangjiakou)</li>
     * <li>cn-shenzhen: China (Shenzhen)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The UUIDs of the servers on which you want to install the Security Center agent. Separate multiple UUIDs with commas (,).</p>
     * <blockquote>
     * <p>You must specify at least one of the <strong>InstanceIds</strong> and <strong>Uuids</strong> parameters before you can call this operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1587bedb-fdb4-48c4-9330-************</p>
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
