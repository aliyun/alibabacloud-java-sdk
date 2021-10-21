// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class ListNotaryInfosRequest extends TeaModel {
    @NameInMap("NotaryType")
    public Integer notaryType;

    @NameInMap("BizOrderNo")
    public String bizOrderNo;

    @NameInMap("Token")
    public String token;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListNotaryInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNotaryInfosRequest self = new ListNotaryInfosRequest();
        return TeaModel.build(map, self);
    }

    public ListNotaryInfosRequest setNotaryType(Integer notaryType) {
        this.notaryType = notaryType;
        return this;
    }
    public Integer getNotaryType() {
        return this.notaryType;
    }

    public ListNotaryInfosRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public ListNotaryInfosRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public ListNotaryInfosRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListNotaryInfosRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
