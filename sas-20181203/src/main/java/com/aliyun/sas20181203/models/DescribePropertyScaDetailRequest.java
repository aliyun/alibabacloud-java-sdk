// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyScaDetailRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("SearchItem")
    public String searchItem;

    @NameInMap("SearchInfo")
    public String searchInfo;

    @NameInMap("ScaName")
    public String scaName;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("SearchItemSub")
    public String searchItemSub;

    @NameInMap("SearchInfoSub")
    public String searchInfoSub;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("Name")
    public Long name;

    @NameInMap("Uuid")
    public String uuid;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribePropertyScaDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyScaDetailRequest self = new DescribePropertyScaDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribePropertyScaDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribePropertyScaDetailRequest setSearchItem(String searchItem) {
        this.searchItem = searchItem;
        return this;
    }
    public String getSearchItem() {
        return this.searchItem;
    }

    public DescribePropertyScaDetailRequest setSearchInfo(String searchInfo) {
        this.searchInfo = searchInfo;
        return this;
    }
    public String getSearchInfo() {
        return this.searchInfo;
    }

    public DescribePropertyScaDetailRequest setScaName(String scaName) {
        this.scaName = scaName;
        return this;
    }
    public String getScaName() {
        return this.scaName;
    }

    public DescribePropertyScaDetailRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DescribePropertyScaDetailRequest setSearchItemSub(String searchItemSub) {
        this.searchItemSub = searchItemSub;
        return this;
    }
    public String getSearchItemSub() {
        return this.searchItemSub;
    }

    public DescribePropertyScaDetailRequest setSearchInfoSub(String searchInfoSub) {
        this.searchInfoSub = searchInfoSub;
        return this;
    }
    public String getSearchInfoSub() {
        return this.searchInfoSub;
    }

    public DescribePropertyScaDetailRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribePropertyScaDetailRequest setName(Long name) {
        this.name = name;
        return this;
    }
    public Long getName() {
        return this.name;
    }

    public DescribePropertyScaDetailRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public DescribePropertyScaDetailRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribePropertyScaDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
