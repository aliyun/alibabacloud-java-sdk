// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701.models;

import com.aliyun.tea.*;

public class AddMtIntervenePackageResponseBody extends TeaModel {
    @NameInMap("Message")
    public Integer message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PackageId")
    public String packageId;

    @NameInMap("Code")
    public Integer code;

    public static AddMtIntervenePackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMtIntervenePackageResponseBody self = new AddMtIntervenePackageResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMtIntervenePackageResponseBody setMessage(Integer message) {
        this.message = message;
        return this;
    }
    public Integer getMessage() {
        return this.message;
    }

    public AddMtIntervenePackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddMtIntervenePackageResponseBody setPackageId(String packageId) {
        this.packageId = packageId;
        return this;
    }
    public String getPackageId() {
        return this.packageId;
    }

    public AddMtIntervenePackageResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

}
