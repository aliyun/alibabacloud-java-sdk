// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyHostsPortRequest extends TeaModel {
    /**
     * <p>The IDs of the hosts whose O&amp;M protocols and ports you want to modify. The value is a JSON string. You can enter up to 100 host IDs. Separate multiple host IDs with commas (,).</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/200665.html">ListHosts</a> operation to query the host IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;1&quot;,&quot;2&quot;,&quot;3&quot;]</p>
     */
    @NameInMap("HostIds")
    public String hostIds;

    /**
     * <p>The ID of the Bastionhost instance where the hosts whose protocol ports you want to modify reside.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the instance ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The new port number. The port number must be an integer. Valid values: 22 to 65535.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the protocol whose port you want to modify. Valid values:</p>
     * <ul>
     * <li><strong>SSH</strong></li>
     * <li><strong>RDP</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SSH</p>
     */
    @NameInMap("ProtocolName")
    public String protocolName;

    /**
     * <p>The region ID of the Bastionhost instance where the hosts whose ports you want to modify reside.</p>
     * <blockquote>
     * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyHostsPortRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHostsPortRequest self = new ModifyHostsPortRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHostsPortRequest setHostIds(String hostIds) {
        this.hostIds = hostIds;
        return this;
    }
    public String getHostIds() {
        return this.hostIds;
    }

    public ModifyHostsPortRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyHostsPortRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public ModifyHostsPortRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ModifyHostsPortRequest setProtocolName(String protocolName) {
        this.protocolName = protocolName;
        return this;
    }
    public String getProtocolName() {
        return this.protocolName;
    }

    public ModifyHostsPortRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
