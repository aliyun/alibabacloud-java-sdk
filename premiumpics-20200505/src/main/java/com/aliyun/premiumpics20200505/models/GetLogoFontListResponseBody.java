// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class GetLogoFontListResponseBody extends TeaModel {
    @NameInMap("Fonts")
    public java.util.List<GetLogoFontListResponseBodyFonts> fonts;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetLogoFontListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLogoFontListResponseBody self = new GetLogoFontListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLogoFontListResponseBody setFonts(java.util.List<GetLogoFontListResponseBodyFonts> fonts) {
        this.fonts = fonts;
        return this;
    }
    public java.util.List<GetLogoFontListResponseBodyFonts> getFonts() {
        return this.fonts;
    }

    public GetLogoFontListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLogoFontListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetLogoFontListResponseBodyFonts extends TeaModel {
        @NameInMap("FontId")
        public String fontId;

        @NameInMap("Image")
        public String image;

        @NameInMap("Name")
        public String name;

        public static GetLogoFontListResponseBodyFonts build(java.util.Map<String, ?> map) throws Exception {
            GetLogoFontListResponseBodyFonts self = new GetLogoFontListResponseBodyFonts();
            return TeaModel.build(map, self);
        }

        public GetLogoFontListResponseBodyFonts setFontId(String fontId) {
            this.fontId = fontId;
            return this;
        }
        public String getFontId() {
            return this.fontId;
        }

        public GetLogoFontListResponseBodyFonts setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public GetLogoFontListResponseBodyFonts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
