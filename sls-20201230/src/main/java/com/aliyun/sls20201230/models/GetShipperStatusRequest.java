// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetShipperStatusRequest extends TeaModel {
    @NameInMap("from")
    public Long from;

    @NameInMap("offset")
    public Integer offset;

    @NameInMap("size")
    public Integer size;

    @NameInMap("status")
    public String status;

    @NameInMap("to")
    public Long to;

    public static GetShipperStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetShipperStatusRequest self = new GetShipperStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetShipperStatusRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public GetShipperStatusRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public GetShipperStatusRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public GetShipperStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetShipperStatusRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

}
