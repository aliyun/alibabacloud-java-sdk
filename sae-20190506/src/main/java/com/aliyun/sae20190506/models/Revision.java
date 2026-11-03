// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class Revision extends TeaModel {
    /**
     * <p>The time when the revision version was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-06-09T14:24:42</p>
     */
    @NameInMap("CreatedTime")
    public String createdTime;

    /**
     * <p>The description of the revision version.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The configurations of the revision version.</p>
     */
    @NameInMap("RevisionConfig")
    public RevisionConfig revisionConfig;

    /**
     * <p>The ID of the revision version.</p>
     * 
     * <strong>example:</strong>
     * <p>001</p>
     */
    @NameInMap("RevisionId")
    public String revisionId;

    /**
     * <p>The traffic weight of the version.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Weight")
    public Float weight;

    public static Revision build(java.util.Map<String, ?> map) throws Exception {
        Revision self = new Revision();
        return TeaModel.build(map, self);
    }

    public Revision setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public Revision setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Revision setRevisionConfig(RevisionConfig revisionConfig) {
        this.revisionConfig = revisionConfig;
        return this;
    }
    public RevisionConfig getRevisionConfig() {
        return this.revisionConfig;
    }

    public Revision setRevisionId(String revisionId) {
        this.revisionId = revisionId;
        return this;
    }
    public String getRevisionId() {
        return this.revisionId;
    }

    public Revision setWeight(Float weight) {
        this.weight = weight;
        return this;
    }
    public Float getWeight() {
        return this.weight;
    }

}
