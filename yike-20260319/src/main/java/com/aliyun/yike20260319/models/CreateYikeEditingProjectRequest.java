// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class CreateYikeEditingProjectRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://example.com/example.png">https://example.com/example.png</a></p>
     */
    @NameInMap("CoverURL")
    public String coverURL;

    /**
     * <strong>example:</strong>
     * <p>{&quot;video&quot;:&quot;<em><strong><strong>2e057304fcd9b145c5cafc</strong></strong></em>&quot;, &quot;image&quot;:&quot;<strong><strong>8021a8d493da643c8acd98</strong></strong>*,<em><strong><strong>cb6307a4edea614d8b3f3c</strong></strong></em>&quot;, &quot;liveStream&quot;: &quot;rtmp://domain.com/app/stream&quot;, &quot;editingProject&quot;: &quot;xxxxx&quot;}</p>
     */
    @NameInMap("MaterialMaps")
    public String materialMaps;

    /**
     * <strong>example:</strong>
     * <p>{&quot;VideoTracks&quot;:[{&quot;VideoTrackClips&quot;:[{&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;},{&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;}]}]}</p>
     */
    @NameInMap("Timeline")
    public String timeline;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Title")
    public String title;

    public static CreateYikeEditingProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateYikeEditingProjectRequest self = new CreateYikeEditingProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateYikeEditingProjectRequest setCoverURL(String coverURL) {
        this.coverURL = coverURL;
        return this;
    }
    public String getCoverURL() {
        return this.coverURL;
    }

    public CreateYikeEditingProjectRequest setMaterialMaps(String materialMaps) {
        this.materialMaps = materialMaps;
        return this;
    }
    public String getMaterialMaps() {
        return this.materialMaps;
    }

    public CreateYikeEditingProjectRequest setTimeline(String timeline) {
        this.timeline = timeline;
        return this;
    }
    public String getTimeline() {
        return this.timeline;
    }

    public CreateYikeEditingProjectRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
