// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSupportOnlineResizeDiskResponseBody extends TeaModel {
    /**
     * <p>The response code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>NotExists.InstanceId</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response result set.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;SupportOnlineResizeDisk&quot;:true,&quot;DBInstanceName&quot;:&quot;rm-uf6wjk5xxxxxxx&quot;}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8B993DA9-5272-5414-94E3-4CA8BA0146C2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeSupportOnlineResizeDiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupportOnlineResizeDiskResponseBody self = new DescribeSupportOnlineResizeDiskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSupportOnlineResizeDiskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSupportOnlineResizeDiskResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeSupportOnlineResizeDiskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSupportOnlineResizeDiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSupportOnlineResizeDiskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
