// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701.models;

import com.aliyun.tea.*;

public class AddMtIntervenePackageResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("Message")
    @Validation(required = true)
    public Integer message;

    @NameInMap("PackageId")
    @Validation(required = true)
    public String packageId;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AddMtIntervenePackageResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMtIntervenePackageResponse self = new AddMtIntervenePackageResponse();
        return TeaModel.build(map, self);
    }

    public AddMtIntervenePackageResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AddMtIntervenePackageResponse setMessage(Integer message) {
        this.message = message;
        return this;
    }
    public Integer getMessage() {
        return this.message;
    }

    public AddMtIntervenePackageResponse setPackageId(String packageId) {
        this.packageId = packageId;
        return this;
    }
    public String getPackageId() {
        return this.packageId;
    }

    public AddMtIntervenePackageResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
