// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListOperationHostsRequest extends TeaModel {
    /**
     * <p>The address of the host that you want to query. You can set this parameter to a domain name or an IP address. Only exact match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>10.162.172.132</p>
     */
    @NameInMap("HostAddress")
    public String hostAddress;

    /**
     * <p>The name of the host that you want to query. Only exact match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The ID of the bastion host.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the ID of the bastion host.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-09k22avmw0q</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The operating system of the host that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>Linux</strong></li>
     * <li><strong>Windows</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Linux</p>
     */
    @NameInMap("OSType")
    public String OSType;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.\
     * Maximum value: 100. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <blockquote>
     * <p> We recommend that you do not leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The region ID of the bastion host.</p>
     * <blockquote>
     * <p> For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The source of the host that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>Local</strong></li>
     * <li><strong>Ecs</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Local</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The ID of the Elastic Compute Service (ECS) instance. Exact match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp19ienyt0yax748****</p>
     */
    @NameInMap("SourceInstanceId")
    public String sourceInstanceId;

    /**
     * <p>The status of the host that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong></li>
     * <li><strong>Release</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("SourceInstanceState")
    public String sourceInstanceState;

    public static ListOperationHostsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOperationHostsRequest self = new ListOperationHostsRequest();
        return TeaModel.build(map, self);
    }

    public ListOperationHostsRequest setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress;
        return this;
    }
    public String getHostAddress() {
        return this.hostAddress;
    }

    public ListOperationHostsRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public ListOperationHostsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListOperationHostsRequest setOSType(String OSType) {
        this.OSType = OSType;
        return this;
    }
    public String getOSType() {
        return this.OSType;
    }

    public ListOperationHostsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListOperationHostsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListOperationHostsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListOperationHostsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ListOperationHostsRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public ListOperationHostsRequest setSourceInstanceState(String sourceInstanceState) {
        this.sourceInstanceState = sourceInstanceState;
        return this;
    }
    public String getSourceInstanceState() {
        return this.sourceInstanceState;
    }

}
