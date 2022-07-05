// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetContextLogsRequest extends TeaModel {
    // 指定起始日志往前（上文）的日志条数，取值范围为(0,100]。
    @NameInMap("back_lines")
    public Long backLines;

    // 指定起始日志往后（下文）的日志条数，取值范围为(0,100]。
    @NameInMap("forward_lines")
    public Long forwardLines;

    // 起始日志所属的LogGroup的唯一身份标识。
    @NameInMap("pack_id")
    public String packId;

    // 起始日志在对应LogGroup内的唯一上下文结构标识。
    @NameInMap("pack_meta")
    public String packMeta;

    // Logstore中数据的类型。该接口中该参数固定为context_log。
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
