// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpoptb_test81_0_0.models;

import com.aliyun.tea.*;

public class TestTbResponseBody extends TeaModel {
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
    public TestTbResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("total")
    public Long total;

    @NameInMap("totalPage")
    public Integer totalPage;

    public static TestTbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TestTbResponseBody self = new TestTbResponseBody();
        return TeaModel.build(map, self);
    }

    public TestTbResponseBody setBizException(Boolean bizException) {
        this.bizException = bizException;
        return this;
    }
    public Boolean getBizException() {
        return this.bizException;
    }

    public TestTbResponseBody setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public TestTbResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public TestTbResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public TestTbResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public TestTbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TestTbResponseBody setResult(TestTbResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public TestTbResponseBodyResult getResult() {
        return this.result;
    }

    public TestTbResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TestTbResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public TestTbResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class TestTbResponseBodyResult extends TeaModel {
        @NameInMap("big")
        public Float big;

        @NameInMap("date")
        public Long date;

        @NameInMap("dou")
        public Float dou;

        @NameInMap("test")
        public String test;

        public static TestTbResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            TestTbResponseBodyResult self = new TestTbResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public TestTbResponseBodyResult setBig(Float big) {
            this.big = big;
            return this;
        }
        public Float getBig() {
            return this.big;
        }

        public TestTbResponseBodyResult setDate(Long date) {
            this.date = date;
            return this;
        }
        public Long getDate() {
            return this.date;
        }

        public TestTbResponseBodyResult setDou(Float dou) {
            this.dou = dou;
            return this;
        }
        public Float getDou() {
            return this.dou;
        }

        public TestTbResponseBodyResult setTest(String test) {
            this.test = test;
            return this;
        }
        public String getTest() {
            return this.test;
        }

    }

}
