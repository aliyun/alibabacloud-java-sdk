// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class ViewPlugin extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BindField")
    public String bindField;

    @NameInMap("Convertor")
    public String convertor;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CorsProxy")
    public Boolean corsProxy;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DisplayOriImg")
    public Boolean displayOriImg;

    @NameInMap("Exif")
    public java.util.Map<String, ?> exif;

    @NameInMap("Hide")
    public Boolean hide;

    @NameInMap("Plugins")
    public java.util.Map<String, ?> plugins;

    @NameInMap("RelationQuestionIds")
    public java.util.List<String> relationQuestionIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public String type;

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
        @NameInMap("aftsConf")
        public java.util.Map<String, ?> aftsConf;

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
