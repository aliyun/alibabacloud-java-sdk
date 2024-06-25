// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetSubCrowdResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2021-12-15T23:24:33.132+08:00</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Quantity")
    public String quantity;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>01D22D08-BA20-5F35-8302-99115F288220</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>ManualInput</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <strong>example:</strong>
     * <p>user1,user2</p>
     */
    @NameInMap("Users")
    public String users;

    public static GetSubCrowdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSubCrowdResponseBody self = new GetSubCrowdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSubCrowdResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetSubCrowdResponseBody setQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }
    public String getQuantity() {
        return this.quantity;
    }

    public GetSubCrowdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSubCrowdResponseBody setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetSubCrowdResponseBody setUsers(String users) {
        this.users = users;
        return this;
    }
    public String getUsers() {
        return this.users;
    }

}
