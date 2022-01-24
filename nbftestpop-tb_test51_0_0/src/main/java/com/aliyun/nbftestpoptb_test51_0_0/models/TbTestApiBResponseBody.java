// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpoptb_test51_0_0.models;

import com.aliyun.tea.*;

public class TbTestApiBResponseBody extends TeaModel {
    @NameInMap("bizException")
    public Boolean bizException;

    @NameInMap("current")
    public Integer current;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public TbTestApiBResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("total")
    public Long total;

    @NameInMap("totalPage")
    public Integer totalPage;

    public static TbTestApiBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TbTestApiBResponseBody self = new TbTestApiBResponseBody();
        return TeaModel.build(map, self);
    }

    public TbTestApiBResponseBody setBizException(Boolean bizException) {
        this.bizException = bizException;
        return this;
    }
    public Boolean getBizException() {
        return this.bizException;
    }

    public TbTestApiBResponseBody setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public TbTestApiBResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public TbTestApiBResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public TbTestApiBResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public TbTestApiBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TbTestApiBResponseBody setResult(TbTestApiBResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public TbTestApiBResponseBodyResult getResult() {
        return this.result;
    }

    public TbTestApiBResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TbTestApiBResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public TbTestApiBResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class TbTestApiBResponseBodyResult extends TeaModel {
        @NameInMap("test")
        public String test;

        public static TbTestApiBResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            TbTestApiBResponseBodyResult self = new TbTestApiBResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public TbTestApiBResponseBodyResult setTest(String test) {
            this.test = test;
            return this;
        }
        public String getTest() {
            return this.test;
        }

    }

}
