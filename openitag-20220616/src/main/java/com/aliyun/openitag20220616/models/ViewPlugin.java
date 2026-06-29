// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class ViewPlugin extends TeaModel {
    /**
     * <p>Field mapping to a field in the dataset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>url</p>
     */
    @NameInMap("BindField")
    public String bindField;

    /**
     * <p>Array transformation UDF.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Convertor")
    public String convertor;

    /**
     * <p>Whether to handle cross-domain requests.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CorsProxy")
    public Boolean corsProxy;

    /**
     * <p>Whether to display the original image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DisplayOriImg")
    public Boolean displayOriImg;

    /**
     * <p>Extra information.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Exif")
    public java.util.Map<String, ?> exif;

    /**
     * <p>Whether to hide.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Hide")
    public Boolean hide;

    /**
     * <p>Nested widgets.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("Plugins")
    public java.util.Map<String, ?> plugins;

    /**
     * <p>List of associated questions.</p>
     */
    @NameInMap("RelationQuestionIds")
    public java.util.List<String> relationQuestionIds;

    /**
     * <p>Widget type. Valid values:</p>
     * <ul>
     * <li>Image: Image.</li>
     * <li>Text: Text.</li>
     * <li>Video: Video.</li>
     * <li>Audio: Audio.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Text</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>Access information.</p>
     */
    @NameInMap("VisitInfo")
    public ViewPluginVisitInfo visitInfo;

    public static ViewPlugin build(java.util.Map<String, ?> map) throws Exception {
        ViewPlugin self = new ViewPlugin();
        return TeaModel.build(map, self);
    }

    public ViewPlugin setBindField(String bindField) {
        this.bindField = bindField;
        return this;
    }
    public String getBindField() {
        return this.bindField;
    }

    public ViewPlugin setConvertor(String convertor) {
        this.convertor = convertor;
        return this;
    }
    public String getConvertor() {
        return this.convertor;
    }

    public ViewPlugin setCorsProxy(Boolean corsProxy) {
        this.corsProxy = corsProxy;
        return this;
    }
    public Boolean getCorsProxy() {
        return this.corsProxy;
    }

    public ViewPlugin setDisplayOriImg(Boolean displayOriImg) {
        this.displayOriImg = displayOriImg;
        return this;
    }
    public Boolean getDisplayOriImg() {
        return this.displayOriImg;
    }

    public ViewPlugin setExif(java.util.Map<String, ?> exif) {
        this.exif = exif;
        return this;
    }
    public java.util.Map<String, ?> getExif() {
        return this.exif;
    }

    public ViewPlugin setHide(Boolean hide) {
        this.hide = hide;
        return this;
    }
    public Boolean getHide() {
        return this.hide;
    }

    public ViewPlugin setPlugins(java.util.Map<String, ?> plugins) {
        this.plugins = plugins;
        return this;
    }
    public java.util.Map<String, ?> getPlugins() {
        return this.plugins;
    }

    public ViewPlugin setRelationQuestionIds(java.util.List<String> relationQuestionIds) {
        this.relationQuestionIds = relationQuestionIds;
        return this;
    }
    public java.util.List<String> getRelationQuestionIds() {
        return this.relationQuestionIds;
    }

    public ViewPlugin setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ViewPlugin setVisitInfo(ViewPluginVisitInfo visitInfo) {
        this.visitInfo = visitInfo;
        return this;
    }
    public ViewPluginVisitInfo getVisitInfo() {
        return this.visitInfo;
    }

    public static class ViewPluginVisitInfo extends TeaModel {
        /**
         * <p>AFTS configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;expiredTime&quot;:1}</p>
         */
        @NameInMap("aftsConf")
        public java.util.Map<String, ?> aftsConf;

        /**
         * <p>OSS configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ossEndpoint&quot;:&quot;&quot;,&quot;ossAk&quot;:&quot;&quot;,&quot;ossAs&quot;:&quot;&quot;,&quot;ossOwner&quot;:&quot;&quot;,&quot;ossBucket&quot;:&quot;&quot;,&quot;folder&quot;:&quot;&quot;,&quot;expiredTime&quot;:&quot;&quot;}</p>
         */
        @NameInMap("ossConf")
        public java.util.Map<String, ?> ossConf;

        public static ViewPluginVisitInfo build(java.util.Map<String, ?> map) throws Exception {
            ViewPluginVisitInfo self = new ViewPluginVisitInfo();
            return TeaModel.build(map, self);
        }

        public ViewPluginVisitInfo setAftsConf(java.util.Map<String, ?> aftsConf) {
            this.aftsConf = aftsConf;
            return this;
        }
        public java.util.Map<String, ?> getAftsConf() {
            return this.aftsConf;
        }

        public ViewPluginVisitInfo setOssConf(java.util.Map<String, ?> ossConf) {
            this.ossConf = ossConf;
            return this;
        }
        public java.util.Map<String, ?> getOssConf() {
            return this.ossConf;
        }

    }

}
