// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.um_test20211027.models;

import com.aliyun.tea.*;

public class UploadNotaryResponseBody extends TeaModel {
    @NameInMap("code")
    public Long code;

    @NameInMap("data")
    public String data;

    @NameInMap("detailMsg")
    public String detailMsg;

    @NameInMap("msg")
    public String msg;

    public static UploadNotaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadNotaryResponseBody self = new UploadNotaryResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadNotaryResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public UploadNotaryResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UploadNotaryResponseBody setDetailMsg(String detailMsg) {
        this.detailMsg = detailMsg;
        return this;
    }
    public String getDetailMsg() {
        return this.detailMsg;
    }

    public UploadNotaryResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

}
