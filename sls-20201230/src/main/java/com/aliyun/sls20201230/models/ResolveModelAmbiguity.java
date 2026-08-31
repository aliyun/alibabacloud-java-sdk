// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ResolveModelAmbiguity extends TeaModel {
    /**
     * <p>The list of candidate options. <strong>The shape is determined by <code>type</code></strong>. Both shapes include an <code>id</code> (such as <code>o1</code> or <code>o2</code>) for the caller to pass back the selection. When <code>type=semantic</code>, each item contains exactly four fields: <code>id</code> / <code>label</code> / <code>description</code> / <code>context</code>, where <code>context</code> has the same structure as the top-level <code>context</code> in the response (<strong>note that the candidate item itself is not a context but a wrapper around it</strong>). When <code>type=data_source</code>, each item contains exactly two fields: <code>id</code> / <code>dataSource</code>, with the physical coordinates embedded in <code>dataSource</code> (including <code>region</code> / <code>project</code> / <code>logstore</code>), <strong>not flattened at the top level of the candidate item</strong>. Each item is an <strong>open object</strong>. The server may add or remove fields as the semantic layer evolves. Callers should read fields as needed and tolerate unknown fields.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;id&quot;: &quot;o1&quot;, &quot;dataSource&quot;: {&quot;region&quot;: &quot;cn-hangzhou&quot;, &quot;project&quot;: &quot;order-logs-a&quot;, &quot;logstore&quot;: &quot;orders&quot;}}, {&quot;id&quot;: &quot;o2&quot;, &quot;dataSource&quot;: {&quot;region&quot;: &quot;cn-hangzhou&quot;, &quot;project&quot;: &quot;order-logs-b&quot;, &quot;logstore&quot;: &quot;orders&quot;}}]</p>
     */
    @NameInMap("options")
    public java.util.List<java.util.Map<String, ?>> options;

    /**
     * <p>A clarification question for the caller. You can display it directly to the user or a downstream agent to make a selection from <code>options</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Select the data source for this query</p>
     */
    @NameInMap("question")
    public String question;

    /**
     * <p>The ambiguity type. Valid values: <code>semantic</code> (the question semantically points to multiple candidate contexts) or <code>data_source</code> (the semantics are unique but map to multiple physical data source coordinates). Note that the value <code>data_source</code> of this field is not the same as the top-level <code>dataSource</code> field in the response.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>data_source</p>
     */
    @NameInMap("type")
    public String type;

    public static ResolveModelAmbiguity build(java.util.Map<String, ?> map) throws Exception {
        ResolveModelAmbiguity self = new ResolveModelAmbiguity();
        return TeaModel.build(map, self);
    }

    public ResolveModelAmbiguity setOptions(java.util.List<java.util.Map<String, ?>> options) {
        this.options = options;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getOptions() {
        return this.options;
    }

    public ResolveModelAmbiguity setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public ResolveModelAmbiguity setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
