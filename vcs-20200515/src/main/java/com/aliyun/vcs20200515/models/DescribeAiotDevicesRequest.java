// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeAiotDevicesRequest extends TeaModel {
    @NameInMap("CorpIdList")
    public String corpIdList;

    @NameInMap("IdList")
    public String idList;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    public static DescribeAiotDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiotDevicesRequest self = new DescribeAiotDevicesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAiotDevicesRequest setCorpIdList(String corpIdList) {
        this.corpIdList = corpIdList;
        return this;
    }
    public String getCorpIdList() {
        return this.corpIdList;
    }

    public DescribeAiotDevicesRequest setIdList(String idList) {
        this.idList = idList;
        return this;
    }
    public String getIdList() {
        return this.idList;
    }

    public DescribeAiotDevicesRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribeAiotDevicesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
