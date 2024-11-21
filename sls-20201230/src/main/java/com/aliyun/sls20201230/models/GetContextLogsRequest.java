// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetContextLogsRequest extends TeaModel {
    /**
     * <p>The number of logs that you want to obtain and are generated before the generation time of the start log. Valid values: <code>(0,100]</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("back_lines")
    public Long backLines;

    /**
     * <p>The number of logs that you want to obtain and are generated after the generation time of the start log. Valid values: <code>(0,100]</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("forward_lines")
    public Long forwardLines;

    /**
     * <p>The unique identifier of the log group to which the start log belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>85C897C740352DC6-808</p>
     */
    @NameInMap("pack_id")
    public String packId;

    /**
     * <p>The unique context identifier of the start log in the log group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2|MTY1NTcwNTUzODY5MTY0MDk1Mg==|3|0</p>
     */
    @NameInMap("pack_meta")
    public String packMeta;

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

}
