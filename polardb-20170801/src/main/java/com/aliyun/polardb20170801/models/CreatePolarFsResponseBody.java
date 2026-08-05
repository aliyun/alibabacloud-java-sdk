// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreatePolarFsResponseBody extends TeaModel {
    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2035638*******</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The PolarFS instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-2ze0i74ka607wck3</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    /**
     * <p>The PolarFS file system path.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-xxx*******</p>
     */
    @NameInMap("PolarFsPath")
    public String polarFsPath;

    /**
     * <p>The PolarFS instance status.</p>
     * 
     * <strong>example:</strong>
     * <p>Creating</p>
     */
    @NameInMap("PolarFsStatus")
    public String polarFsStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CED079B7-A408-41A1-BFF1-EC608E******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePolarFsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePolarFsResponseBody self = new CreatePolarFsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePolarFsResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreatePolarFsResponseBody setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public CreatePolarFsResponseBody setPolarFsPath(String polarFsPath) {
        this.polarFsPath = polarFsPath;
        return this;
    }
    public String getPolarFsPath() {
        return this.polarFsPath;
    }

    public CreatePolarFsResponseBody setPolarFsStatus(String polarFsStatus) {
        this.polarFsStatus = polarFsStatus;
        return this;
    }
    public String getPolarFsStatus() {
        return this.polarFsStatus;
    }

    public CreatePolarFsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
