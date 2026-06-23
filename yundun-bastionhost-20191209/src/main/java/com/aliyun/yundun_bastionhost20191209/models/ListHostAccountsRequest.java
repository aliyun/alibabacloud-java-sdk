// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostAccountsRequest extends TeaModel {
    /**
     * <p>The name of the host account that you want to query. The name can be up to 128 characters in length. This parameter supports only term queries.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("HostAccountName")
    public String hostAccountName;

    /**
     * <p>The ID of the host for which you want to query host accounts.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/200665.html">ListHosts</a> operation to obtain the host ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HostId")
    public String hostId;

    /**
     * <p>The array of host IDs for which you want to query host accounts.</p>
     * <blockquote>
     * <p>This parameter takes effect only when the value of the HostId parameter is 0. If the HostId parameter is specified with a non-zero value, this parameter is ignored.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;2&quot;,&quot;3&quot;]</p>
     */
    @NameInMap("HostIds")
    public String hostIds;

    /**
     * <p>The ID of the Bastionhost instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain the instance ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries to return on each page.<br> The maximum value of the PageSize parameter is 100. The default value is 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <blockquote>
     * <p>We recommend that you do not leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The protocol of the host account that you want to query.<br> Valid values:</p>
     * <ul>
     * <li><p>SSH</p>
     * </li>
     * <li><p>RDP</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SSH</p>
     */
    @NameInMap("ProtocolName")
    public String protocolName;

    /**
     * <p>The region ID of the Bastionhost instance.</p>
     * <blockquote>
     * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListHostAccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHostAccountsRequest self = new ListHostAccountsRequest();
        return TeaModel.build(map, self);
    }

    public ListHostAccountsRequest setHostAccountName(String hostAccountName) {
        this.hostAccountName = hostAccountName;
        return this;
    }
    public String getHostAccountName() {
        return this.hostAccountName;
    }

    public ListHostAccountsRequest setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public ListHostAccountsRequest setHostIds(String hostIds) {
        this.hostIds = hostIds;
        return this;
    }
    public String getHostIds() {
        return this.hostIds;
    }

    public ListHostAccountsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListHostAccountsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListHostAccountsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListHostAccountsRequest setProtocolName(String protocolName) {
        this.protocolName = protocolName;
        return this;
    }
    public String getProtocolName() {
        return this.protocolName;
    }

    public ListHostAccountsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
