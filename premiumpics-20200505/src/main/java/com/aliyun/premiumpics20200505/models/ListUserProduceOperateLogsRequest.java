// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class ListUserProduceOperateLogsRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>BizType</p>
     */
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListUserProduceOperateLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserProduceOperateLogsRequest self = new ListUserProduceOperateLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListUserProduceOperateLogsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ListUserProduceOperateLogsRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ListUserProduceOperateLogsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListUserProduceOperateLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
