// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateVodTemplateRequest extends TeaModel {
    /**
     * <p>The name of the template.</p>
     * <ul>
     * <li>The name can be up to 128 bytes in length.</li>
     * <li>The value must be encoded in UTF-8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The configurations of the snapshot template. The value is a JSON-formatted string. For more information about the data structure, see the &quot;SnapshotTemplateConfig&quot; section of the <a href="https://help.aliyun.com/document_detail/98618.html">Media processing parameters</a> topic.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;SnapshotConfig&quot;:{&quot;Count&quot;:10,&quot;SpecifiedOffsetTime&quot;:0,&quot;Interval&quot;:1}</p>
     */
    @NameInMap("TemplateConfig")
    public String templateConfig;

    /**
     * <p>The ID of the snapshot template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8c75a02e339b*****0b0d2c48171a22</p>
     */
    @NameInMap("VodTemplateId")
    public String vodTemplateId;

    public static UpdateVodTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVodTemplateRequest self = new UpdateVodTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVodTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateVodTemplateRequest setTemplateConfig(String templateConfig) {
        this.templateConfig = templateConfig;
        return this;
    }
    public String getTemplateConfig() {
        return this.templateConfig;
    }

    public UpdateVodTemplateRequest setVodTemplateId(String vodTemplateId) {
        this.vodTemplateId = vodTemplateId;
        return this;
    }
    public String getVodTemplateId() {
        return this.vodTemplateId;
    }

}
