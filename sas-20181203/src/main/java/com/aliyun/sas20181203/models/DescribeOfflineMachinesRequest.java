// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeOfflineMachinesRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The operating system of the server.</p>
     * <blockquote>
     * <p> The value of this parameter is the value of the Values parameter that is returned by calling the <a href="~~DescribeCriteria~~">DescribeCriteria</a> operation. If the value of the <strong>Name</strong> parameter in the response is <strong>osType</strong>, the value of the <strong>Values</strong> parameter indicates an operating system.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>linux</p>
     */
    @NameInMap("Os")
    public String os;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>5</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region in which the server resides.</p>
     * <blockquote>
     * <p> The value of this parameter is the value of the Values parameter that is returned by calling the <a href="~~DescribeCriteria~~">DescribeCriteria</a> operation. If the value of the <strong>Name</strong> parameter in the response is <strong>regionId</strong>, the value of the <strong>Values</strong> parameter indicates a region ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionIdStr")
    public String regionIdStr;

    /**
     * <p>The region in which the server resides.</p>
     * <blockquote>
     * <p> The value of this parameter is the value of the Values parameter that is returned by calling the <a href="~~DescribeCriteria~~">DescribeCriteria</a> operation. If the value of the <strong>Name</strong> parameter in the response is <strong>regionId</strong>, the value of the <strong>Values</strong> parameter indicates a region ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <p>The information about the server that you want to query. The value can be the name or the public IP address of the server.</p>
     * 
     * <strong>example:</strong>
     * <p>172.20.XX.XX</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>180.113.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The source of the server. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: an asset provided by Alibaba Cloud.</li>
     * <li><strong>1</strong>: a third-party cloud server</li>
     * <li><strong>2</strong>: a server in a data center</li>
     * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: other cloud asset</li>
     * <li><strong>8</strong>: a lightweight asset</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Vendor")
    public Integer vendor;

    public static DescribeOfflineMachinesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOfflineMachinesRequest self = new DescribeOfflineMachinesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOfflineMachinesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeOfflineMachinesRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public DescribeOfflineMachinesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeOfflineMachinesRequest setRegionIdStr(String regionIdStr) {
        this.regionIdStr = regionIdStr;
        return this;
    }
    public String getRegionIdStr() {
        return this.regionIdStr;
    }

    public DescribeOfflineMachinesRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public DescribeOfflineMachinesRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeOfflineMachinesRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeOfflineMachinesRequest setVendor(Integer vendor) {
        this.vendor = vendor;
        return this;
    }
    public Integer getVendor() {
        return this.vendor;
    }

}
