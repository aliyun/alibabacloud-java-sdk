// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CheckIfCollectedResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public CheckIfCollectedResponseBodyData data;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static CheckIfCollectedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckIfCollectedResponseBody self = new CheckIfCollectedResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckIfCollectedResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public CheckIfCollectedResponseBody setData(CheckIfCollectedResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckIfCollectedResponseBodyData getData() {
        return this.data;
    }

    public CheckIfCollectedResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public CheckIfCollectedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckIfCollectedResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public CheckIfCollectedResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class CheckIfCollectedResponseBodyDataTrademark extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("ItemIdList")
        public String itemIdList;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public Integer type;

        public static CheckIfCollectedResponseBodyDataTrademark build(java.util.Map<String, ?> map) throws Exception {
            CheckIfCollectedResponseBodyDataTrademark self = new CheckIfCollectedResponseBodyDataTrademark();
            return TeaModel.build(map, self);
        }

        public CheckIfCollectedResponseBodyDataTrademark setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CheckIfCollectedResponseBodyDataTrademark setItemIdList(String itemIdList) {
            this.itemIdList = itemIdList;
            return this;
        }
        public String getItemIdList() {
            return this.itemIdList;
        }

        public CheckIfCollectedResponseBodyDataTrademark setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CheckIfCollectedResponseBodyDataTrademark setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class CheckIfCollectedResponseBodyData extends TeaModel {
        @NameInMap("Trademark")
        public java.util.List<CheckIfCollectedResponseBodyDataTrademark> trademark;

        public static CheckIfCollectedResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckIfCollectedResponseBodyData self = new CheckIfCollectedResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckIfCollectedResponseBodyData setTrademark(java.util.List<CheckIfCollectedResponseBodyDataTrademark> trademark) {
            this.trademark = trademark;
            return this;
        }
        public java.util.List<CheckIfCollectedResponseBodyDataTrademark> getTrademark() {
            return this.trademark;
        }

    }

}
