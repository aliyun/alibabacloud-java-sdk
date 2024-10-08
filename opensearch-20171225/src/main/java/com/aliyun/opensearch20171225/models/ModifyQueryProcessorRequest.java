// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifyQueryProcessorRequest extends TeaModel {
    /**
     * <p>The request parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;domain&quot;: &quot;GENERAL&quot;,
     *     &quot;category&quot;: &quot;&quot;,
     *     &quot;processors&quot;: [
     *         {
     *             &quot;name&quot;: &quot;synonym&quot;,
     *             &quot;useSystemDictionary&quot;: true
     *         },
     *         {
     *             &quot;name&quot;: &quot;stop_word&quot;,
     *             &quot;useSystemDictionary&quot;: true
     *         }
     *     ]
     * }</p>
     */
    @NameInMap("body")
    public Object body;

    /**
     * <p>Specifies whether the request is a dry run.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static ModifyQueryProcessorRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyQueryProcessorRequest self = new ModifyQueryProcessorRequest();
        return TeaModel.build(map, self);
    }

    public ModifyQueryProcessorRequest setBody(Object body) {
        this.body = body;
        return this;
    }
    public Object getBody() {
        return this.body;
    }

    public ModifyQueryProcessorRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
