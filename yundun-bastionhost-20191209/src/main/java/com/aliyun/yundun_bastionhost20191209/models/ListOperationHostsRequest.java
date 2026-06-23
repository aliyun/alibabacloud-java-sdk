// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListOperationHostsRequest extends TeaModel {
    /**
     * <p>The address of the host. You can specify a domain name or an IP address. Only exact matches are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>10.162.XX.XX</p>
     */
    @NameInMap("HostAddress")
    public String hostAddress;

    /**
     * <p>The name of the host. Only exact matches are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The ID of the Bastionhost instance.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-09k22avmw0q</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The operating system of the host. Valid values:</p>
     * <ul>
     * <li><p><strong>Linux</strong></p>
     * </li>
     * <li><p><strong>Windows</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Linux</p>
     */
    @NameInMap("OSType")
    public String OSType;

    /**
     * <p>The number of the page to return. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries to return on each page.<br> The maximum value is 100. The default value is 20. If you do not specify this parameter, the default value is used.<br></p>
     * <blockquote>
     * <p>Specify a value for this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The ID of the region where the Bastionhost instance resides.</p>
     * <blockquote>
     * <p>For more information about regions and zones, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The source of the host. Valid values:</p>
     * <ul>
     * <li><p><strong>Local</strong>: a local host</p>
     * </li>
     * <li><p><strong>Ecs</strong>: an ECS instance</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Local</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The ID of the ECS instance. Only exact matches are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp19ienyt0yax748****</p>
     */
    @NameInMap("SourceInstanceId")
    public String sourceInstanceId;

    /**
     * <p>The state of the host. Valid values:</p>
     * <ul>
     * <li><p><strong>Normal</strong>: The host is running.</p>
     * </li>
     * <li><p><strong>Release</strong>: The host is released.</p>
     * </li>
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
