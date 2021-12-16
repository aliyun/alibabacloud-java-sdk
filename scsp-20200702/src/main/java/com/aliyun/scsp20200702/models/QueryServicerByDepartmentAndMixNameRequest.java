// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryServicerByDepartmentAndMixNameRequest extends TeaModel {
    // 页码
    @NameInMap("CurrentPageNum")
    public Long currentPageNum;

    // 部门标识列表
    @NameInMap("DepartmentIdList")
    public java.util.List<Long> departmentIdList;

    // AICCS实例ID，在智能联络中心控制台上可以看到
    @NameInMap("InstanceId")
    public String instanceId;

    // 关键字
    @NameInMap("KeyWord")
    public String keyWord;

    // 页大小
    @NameInMap("PageSize")
    public Long pageSize;

    public static QueryServicerByDepartmentAndMixNameRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryServicerByDepartmentAndMixNameRequest self = new QueryServicerByDepartmentAndMixNameRequest();
        return TeaModel.build(map, self);
    }

    public QueryServicerByDepartmentAndMixNameRequest setCurrentPageNum(Long currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Long getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryServicerByDepartmentAndMixNameRequest setDepartmentIdList(java.util.List<Long> departmentIdList) {
        this.departmentIdList = departmentIdList;
        return this;
    }
    public java.util.List<Long> getDepartmentIdList() {
        return this.departmentIdList;
    }

    public QueryServicerByDepartmentAndMixNameRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryServicerByDepartmentAndMixNameRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public QueryServicerByDepartmentAndMixNameRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
