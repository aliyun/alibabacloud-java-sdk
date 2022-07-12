// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class ListNotaryOrdersRequest extends TeaModel {
    @NameInMap("AliyunOrderId")
    public String aliyunOrderId;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("EndOrderDate")
    public Long endOrderDate;

    @NameInMap("NotaryStatus")
    public Integer notaryStatus;

    @NameInMap("NotaryType")
    public Integer notaryType;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SortByType")
    public String sortByType;

    @NameInMap("SortKeyType")
    public Integer sortKeyType;

    @NameInMap("StartOrderDate")
    public Long startOrderDate;

    public static ListNotaryOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNotaryOrdersRequest self = new ListNotaryOrdersRequest();
        return TeaModel.build(map, self);
    }

    public ListNotaryOrdersRequest setAliyunOrderId(String aliyunOrderId) {
        this.aliyunOrderId = aliyunOrderId;
        return this;
    }
    public String getAliyunOrderId() {
        return this.aliyunOrderId;
    }

    public ListNotaryOrdersRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ListNotaryOrdersRequest setEndOrderDate(Long endOrderDate) {
        this.endOrderDate = endOrderDate;
        return this;
    }
    public Long getEndOrderDate() {
        return this.endOrderDate;
    }

    public ListNotaryOrdersRequest setNotaryStatus(Integer notaryStatus) {
        this.notaryStatus = notaryStatus;
        return this;
    }
    public Integer getNotaryStatus() {
        return this.notaryStatus;
    }

    public ListNotaryOrdersRequest setNotaryType(Integer notaryType) {
        this.notaryType = notaryType;
        return this;
    }
    public Integer getNotaryType() {
        return this.notaryType;
    }

    public ListNotaryOrdersRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListNotaryOrdersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNotaryOrdersRequest setSortByType(String sortByType) {
        this.sortByType = sortByType;
        return this;
    }
    public String getSortByType() {
        return this.sortByType;
    }

    public ListNotaryOrdersRequest setSortKeyType(Integer sortKeyType) {
        this.sortKeyType = sortKeyType;
        return this;
    }
    public Integer getSortKeyType() {
        return this.sortKeyType;
    }

    public ListNotaryOrdersRequest setStartOrderDate(Long startOrderDate) {
        this.startOrderDate = startOrderDate;
        return this;
    }
    public Long getStartOrderDate() {
        return this.startOrderDate;
    }

}
