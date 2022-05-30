// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetFreeFlowUsageRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    // 当前页
    @NameInMap("CurPageNum")
    public Integer curPageNum;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 查询月份
    @NameInMap("Month")
    public String month;

    // 每页的记录数量
    @NameInMap("NumPerPage")
    public Integer numPerPage;

    public static GetFreeFlowUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFreeFlowUsageRequest self = new GetFreeFlowUsageRequest();
        return TeaModel.build(map, self);
    }

    public GetFreeFlowUsageRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public GetFreeFlowUsageRequest setCurPageNum(Integer curPageNum) {
        this.curPageNum = curPageNum;
        return this;
    }
    public Integer getCurPageNum() {
        return this.curPageNum;
    }

    public GetFreeFlowUsageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetFreeFlowUsageRequest setMonth(String month) {
        this.month = month;
        return this;
    }
    public String getMonth() {
        return this.month;
    }

    public GetFreeFlowUsageRequest setNumPerPage(Integer numPerPage) {
        this.numPerPage = numPerPage;
        return this;
    }
    public Integer getNumPerPage() {
        return this.numPerPage;
    }

}
