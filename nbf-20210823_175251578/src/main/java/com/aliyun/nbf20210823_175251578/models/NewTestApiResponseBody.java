// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210823_175251578.models;

import com.aliyun.tea.*;

public class NewTestApiResponseBody extends TeaModel {
    @NameInMap("result")
    public String result;

    @NameInMap("current")
    public Integer current;

    @NameInMap("total")
    public Long total;

    @NameInMap("totalPage")
    public Integer totalPage;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("bizException")
    public Boolean bizException;

    @NameInMap("errorMsg")
    public String errorMsg;

    public static NewTestApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        NewTestApiResponseBody self = new NewTestApiResponseBody();
        return TeaModel.build(map, self);
    }

    public NewTestApiResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public NewTestApiResponseBody setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public NewTestApiResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public NewTestApiResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public NewTestApiResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public NewTestApiResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public NewTestApiResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public NewTestApiResponseBody setBizException(Boolean bizException) {
        this.bizException = bizException;
        return this;
    }
    public Boolean getBizException() {
        return this.bizException;
    }

    public NewTestApiResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

}
