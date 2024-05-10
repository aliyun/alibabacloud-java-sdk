// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetShipperStatusRequest extends TeaModel {
    /**
     * <p>The start time of the log shipping job. The value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("from")
    public Long from;

    /**
     * <p>The line from which the query starts. Default value: 0.</p>
     */
    @NameInMap("offset")
    public Integer offset;

    /**
     * <p>The number of entries per page. Default value: 100. Maximum value: 500.</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <p>The status of the log shipping job. This parameter is empty by default, which indicates that log shipping jobs in all states are returned. Valid values: success, fail, and running.</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The end time of the log shipping job. The value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
