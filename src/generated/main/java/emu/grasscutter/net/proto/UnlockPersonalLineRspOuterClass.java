// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UnlockPersonalLineRsp.proto

package emu.grasscutter.net.proto;

public final class UnlockPersonalLineRspOuterClass {
  private UnlockPersonalLineRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UnlockPersonalLineRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UnlockPersonalLineRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 personal_line_id = 9;</code>
     * @return The personalLineId.
     */
    int getPersonalLineId();

    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 chapter_id = 5;</code>
     * @return Whether the chapterId field is set.
     */
    boolean hasChapterId();
    /**
     * <code>uint32 chapter_id = 5;</code>
     * @return The chapterId.
     */
    int getChapterId();

    /**
     * <code>uint32 level = 7;</code>
     * @return Whether the level field is set.
     */
    boolean hasLevel();
    /**
     * <code>uint32 level = 7;</code>
     * @return The level.
     */
    int getLevel();

    public emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp.ParamCase getParamCase();
  }
  /**
   * Protobuf type {@code UnlockPersonalLineRsp}
   */
  public static final class UnlockPersonalLineRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UnlockPersonalLineRsp)
      UnlockPersonalLineRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UnlockPersonalLineRsp.newBuilder() to construct.
    private UnlockPersonalLineRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UnlockPersonalLineRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UnlockPersonalLineRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UnlockPersonalLineRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 40: {
              paramCase_ = 5;
              param_ = input.readUInt32();
              break;
            }
            case 56: {
              paramCase_ = 7;
              param_ = input.readUInt32();
              break;
            }
            case 72: {

              personalLineId_ = input.readUInt32();
              break;
            }
            case 112: {

              retcode_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.internal_static_UnlockPersonalLineRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.internal_static_UnlockPersonalLineRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp.class, emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp.Builder.class);
    }

    private int paramCase_ = 0;
    private java.lang.Object param_;
    public enum ParamCase
        implements com.google.protobuf.Internal.EnumLite,
            com.google.protobuf.AbstractMessage.InternalOneOfEnum {
      CHAPTER_ID(5),
      LEVEL(7),
      PARAM_NOT_SET(0);
      private final int value;
      private ParamCase(int value) {
        this.value = value;
      }
      /**
       * @param value The number of the enum to look for.
       * @return The enum associated with the given number.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static ParamCase valueOf(int value) {
        return forNumber(value);
      }

      public static ParamCase forNumber(int value) {
        switch (value) {
          case 5: return CHAPTER_ID;
          case 7: return LEVEL;
          case 0: return PARAM_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public ParamCase
    getParamCase() {
      return ParamCase.forNumber(
          paramCase_);
    }

    public static final int PERSONAL_LINE_ID_FIELD_NUMBER = 9;
    private int personalLineId_;
    /**
     * <code>uint32 personal_line_id = 9;</code>
     * @return The personalLineId.
     */
    @java.lang.Override
    public int getPersonalLineId() {
      return personalLineId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 14;
    private int retcode_;
    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int CHAPTER_ID_FIELD_NUMBER = 5;
    /**
     * <code>uint32 chapter_id = 5;</code>
     * @return Whether the chapterId field is set.
     */
    @java.lang.Override
    public boolean hasChapterId() {
      return paramCase_ == 5;
    }
    /**
     * <code>uint32 chapter_id = 5;</code>
     * @return The chapterId.
     */
    @java.lang.Override
    public int getChapterId() {
      if (paramCase_ == 5) {
        return (java.lang.Integer) param_;
      }
      return 0;
    }

    public static final int LEVEL_FIELD_NUMBER = 7;
    /**
     * <code>uint32 level = 7;</code>
     * @return Whether the level field is set.
     */
    @java.lang.Override
    public boolean hasLevel() {
      return paramCase_ == 7;
    }
    /**
     * <code>uint32 level = 7;</code>
     * @return The level.
     */
    @java.lang.Override
    public int getLevel() {
      if (paramCase_ == 7) {
        return (java.lang.Integer) param_;
      }
      return 0;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (paramCase_ == 5) {
        output.writeUInt32(
            5, (int)((java.lang.Integer) param_));
      }
      if (paramCase_ == 7) {
        output.writeUInt32(
            7, (int)((java.lang.Integer) param_));
      }
      if (personalLineId_ != 0) {
        output.writeUInt32(9, personalLineId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(14, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (paramCase_ == 5) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(
              5, (int)((java.lang.Integer) param_));
      }
      if (paramCase_ == 7) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(
              7, (int)((java.lang.Integer) param_));
      }
      if (personalLineId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, personalLineId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, retcode_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp other = (emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp) obj;

      if (getPersonalLineId()
          != other.getPersonalLineId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getParamCase().equals(other.getParamCase())) return false;
      switch (paramCase_) {
        case 5:
          if (getChapterId()
              != other.getChapterId()) return false;
          break;
        case 7:
          if (getLevel()
              != other.getLevel()) return false;
          break;
        case 0:
        default:
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + PERSONAL_LINE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPersonalLineId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      switch (paramCase_) {
        case 5:
          hash = (37 * hash) + CHAPTER_ID_FIELD_NUMBER;
          hash = (53 * hash) + getChapterId();
          break;
        case 7:
          hash = (37 * hash) + LEVEL_FIELD_NUMBER;
          hash = (53 * hash) + getLevel();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code UnlockPersonalLineRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UnlockPersonalLineRsp)
        emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.internal_static_UnlockPersonalLineRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.internal_static_UnlockPersonalLineRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp.class, emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        personalLineId_ = 0;

        retcode_ = 0;

        paramCase_ = 0;
        param_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.internal_static_UnlockPersonalLineRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp build() {
        emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp buildPartial() {
        emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp result = new emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp(this);
        result.personalLineId_ = personalLineId_;
        result.retcode_ = retcode_;
        if (paramCase_ == 5) {
          result.param_ = param_;
        }
        if (paramCase_ == 7) {
          result.param_ = param_;
        }
        result.paramCase_ = paramCase_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp) {
          return mergeFrom((emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp other) {
        if (other == emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp.getDefaultInstance()) return this;
        if (other.getPersonalLineId() != 0) {
          setPersonalLineId(other.getPersonalLineId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        switch (other.getParamCase()) {
          case CHAPTER_ID: {
            setChapterId(other.getChapterId());
            break;
          }
          case LEVEL: {
            setLevel(other.getLevel());
            break;
          }
          case PARAM_NOT_SET: {
            break;
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int paramCase_ = 0;
      private java.lang.Object param_;
      public ParamCase
          getParamCase() {
        return ParamCase.forNumber(
            paramCase_);
      }

      public Builder clearParam() {
        paramCase_ = 0;
        param_ = null;
        onChanged();
        return this;
      }


      private int personalLineId_ ;
      /**
       * <code>uint32 personal_line_id = 9;</code>
       * @return The personalLineId.
       */
      @java.lang.Override
      public int getPersonalLineId() {
        return personalLineId_;
      }
      /**
       * <code>uint32 personal_line_id = 9;</code>
       * @param value The personalLineId to set.
       * @return This builder for chaining.
       */
      public Builder setPersonalLineId(int value) {
        
        personalLineId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 personal_line_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearPersonalLineId() {
        
        personalLineId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 14;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      /**
       * <code>uint32 chapter_id = 5;</code>
       * @return Whether the chapterId field is set.
       */
      public boolean hasChapterId() {
        return paramCase_ == 5;
      }
      /**
       * <code>uint32 chapter_id = 5;</code>
       * @return The chapterId.
       */
      public int getChapterId() {
        if (paramCase_ == 5) {
          return (java.lang.Integer) param_;
        }
        return 0;
      }
      /**
       * <code>uint32 chapter_id = 5;</code>
       * @param value The chapterId to set.
       * @return This builder for chaining.
       */
      public Builder setChapterId(int value) {
        paramCase_ = 5;
        param_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 chapter_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearChapterId() {
        if (paramCase_ == 5) {
          paramCase_ = 0;
          param_ = null;
          onChanged();
        }
        return this;
      }

      /**
       * <code>uint32 level = 7;</code>
       * @return Whether the level field is set.
       */
      public boolean hasLevel() {
        return paramCase_ == 7;
      }
      /**
       * <code>uint32 level = 7;</code>
       * @return The level.
       */
      public int getLevel() {
        if (paramCase_ == 7) {
          return (java.lang.Integer) param_;
        }
        return 0;
      }
      /**
       * <code>uint32 level = 7;</code>
       * @param value The level to set.
       * @return This builder for chaining.
       */
      public Builder setLevel(int value) {
        paramCase_ = 7;
        param_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevel() {
        if (paramCase_ == 7) {
          paramCase_ = 0;
          param_ = null;
          onChanged();
        }
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:UnlockPersonalLineRsp)
    }

    // @@protoc_insertion_point(class_scope:UnlockPersonalLineRsp)
    private static final emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp();
    }

    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UnlockPersonalLineRsp>
        PARSER = new com.google.protobuf.AbstractParser<UnlockPersonalLineRsp>() {
      @java.lang.Override
      public UnlockPersonalLineRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UnlockPersonalLineRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UnlockPersonalLineRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UnlockPersonalLineRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UnlockPersonalLineRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UnlockPersonalLineRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033UnlockPersonalLineRsp.proto\"r\n\025UnlockP" +
      "ersonalLineRsp\022\030\n\020personal_line_id\030\t \001(\r" +
      "\022\017\n\007retcode\030\016 \001(\005\022\024\n\nchapter_id\030\005 \001(\rH\000\022" +
      "\017\n\005level\030\007 \001(\rH\000B\007\n\005paramB\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UnlockPersonalLineRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UnlockPersonalLineRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UnlockPersonalLineRsp_descriptor,
        new java.lang.String[] { "PersonalLineId", "Retcode", "ChapterId", "Level", "Param", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
