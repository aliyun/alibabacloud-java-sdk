// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetContextLogsRequest extends TeaModel {
    /**
     * <p>The number of logs that you want to obtain and are generated before the generation time of the start log. Valid values: (0,100].</p>
     */
    @NameInMap("back_lines")
    public Long backLines;

    /**
     * <p>The number of logs that you want to obtain and are generated after the generation time of the start log. Valid values: (0,100].</p>
     */
    @NameInMap("forward_lines")
    public Long forwardLines;

    /**
     * <p>The unique identifier of the log group to which the start log belongs.</p>
     */
    @NameInMap("pack_id")
    public String packId;

    /**
     * <p>The unique context identifier of the start log in the log group.</p>
     */
    @NameInMap("pack_meta")
    public String packMeta;

    /**
     * <p>The type of the data in the Logstore. Set the value to context_log.</p>
     */
    @NameInMap("type")
    public String type;

    public static GetContextLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetContextLogsRequest self = new GetContextLogsRequest();
        return TeaModel.build(map, self);
    }

    public GetContextLogsRequest setBackLines(Long backLines) {
        this.backLines = backLines;
        return this;
    }
    public Long getBackLines() {
        return this.backLines;
    }

    public GetContextLogsRequest setForwardLines(Long forwardLines) {
        this.forwardLines = forwardLines;
        return this;
    }
    public Long getForwardLines() {
        return this.forwardLines;
    }

    public GetContextLogsRequest setPackId(String packId) {
        this.packId = packId;
        return this;
    }
    public String getPackId() {
        return this.packId;
    }

    public GetContextLogsRequest setPackMeta(String packMeta) {
        this.packMeta = packMeta;
        return this;
    }
    public String getPackMeta() {
        return this.packMeta;
    }

    public GetContextLogsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
