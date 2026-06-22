// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUninstallAegisMachinesRequest extends TeaModel {
    /**
     * <p>The page number of the first page to display in the query results. Default value: <strong>1</strong>, which indicates that the query results are displayed from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The operating system.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeCriteria~~">DescribeCriteria</a> operation to obtain supported operating systems from the <strong>Values</strong> of the item whose <strong>Name</strong> is <strong>osType</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>linux</p>
     */
    @NameInMap("Os")
    public String os;

    /**
     * <p>The number of entries per page in a paged query. Default value: <strong>5</strong>, which indicates that 5 entries are displayed per page.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region where the server resides.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeCriteria~~">DescribeCriteria</a> operation to obtain supported regions from the <strong>Values</strong> of the item whose <strong>Name</strong> is <strong>regionId</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionIdStr")
    public String regionIdStr;

    /**
     * <p>The region where the server resides.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeCriteria~~">DescribeCriteria</a> operation to obtain supported regions from the <strong>Values</strong> of the item whose <strong>Name</strong> is <strong>regionId</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <p>The asset information to query. You can set this parameter to the asset name or public IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>172.20.XX.XX</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The IP address of the access source.</p>
     * 
     * <strong>example:</strong>
     * <p>180.113.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The server vendor. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Alibaba Cloud asset</li>
     * <li><strong>1</strong>: non-cloud asset</li>
     * <li><strong>2</strong>: IDC asset</li>
     * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, <strong>7</strong>: third-party cloud asset</li>
     * <li><strong>8</strong>: lightweight asset.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Vendor")
    public Integer vendor;

    public static ListUninstallAegisMachinesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUninstallAegisMachinesRequest self = new ListUninstallAegisMachinesRequest();
        return TeaModel.build(map, self);
    }

    public ListUninstallAegisMachinesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListUninstallAegisMachinesRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public ListUninstallAegisMachinesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUninstallAegisMachinesRequest setRegionIdStr(String regionIdStr) {
        this.regionIdStr = regionIdStr;
        return this;
    }
    public String getRegionIdStr() {
        return this.regionIdStr;
    }

    public ListUninstallAegisMachinesRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public ListUninstallAegisMachinesRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ListUninstallAegisMachinesRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ListUninstallAegisMachinesRequest setVendor(Integer vendor) {
        this.vendor = vendor;
        return this;
    }
    public Integer getVendor() {
        return this.vendor;
    }

}
