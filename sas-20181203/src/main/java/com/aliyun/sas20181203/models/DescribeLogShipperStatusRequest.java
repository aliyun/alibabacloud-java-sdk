// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeLogShipperStatusRequest extends TeaModel {
    /**
     * <p>The ID of the request source. Set the value to **sas**.</p>
     */
    @NameInMap("From")
    public String from;

    public static DescribeLogShipperStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogShipperStatusRequest self = new DescribeLogShipperStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLogShipperStatusRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

}
