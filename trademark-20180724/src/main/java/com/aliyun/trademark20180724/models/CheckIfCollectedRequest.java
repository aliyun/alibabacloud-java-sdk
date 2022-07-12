// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CheckIfCollectedRequest extends TeaModel {
    @NameInMap("ItemIdList")
    public String itemIdList;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Type")
    public Integer type;

    public static CheckIfCollectedRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckIfCollectedRequest self = new CheckIfCollectedRequest();
        return TeaModel.build(map, self);
    }

    public CheckIfCollectedRequest setItemIdList(String itemIdList) {
        this.itemIdList = itemIdList;
        return this;
    }
    public String getItemIdList() {
        return this.itemIdList;
    }

    public CheckIfCollectedRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public CheckIfCollectedRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public CheckIfCollectedRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
